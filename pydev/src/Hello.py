'''
Created on 2017. 7. 20.

@author: student
'''
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By
import pandas as pd

if __name__ == '__main__':
    chromedriver = 'C:\chromedriver_win32\chromedriver.exe'
    driver = webdriver.Chrome(chromedriver)
    driver.get("http://www.kobis.or.kr/kobis/business/mast/mvie/searchMovieList.do")

    btn_query = driver.find_element_by_css_selector('img[src="/kobis/web/comm/images/main/search01.png"]')
    name = driver.find_element_by_name('sMovName')

    name.send_keys('아가씨')
    
    btn_query.click()
    
    result_queyr = driver.find_element_by_css_selector('tbody > tr > td[class="ellipsis"] > a')
    
    result_queyr.click()
    
    popup_query = driver.find_element_by_css_selector('ul[class="tab_layer"] > li > a[style="color: rgb(51, 51, 51);"]')
    popup_query.click()
    
    wait = WebDriverWait(driver, 25)
    body = wait.until(EC.visibility_of_element_located((By.CSS_SELECTOR, 'table[class="board02 bma b02s topico"] > tbody')))
    
    word_list = []
    
    for i in body.find_elements_by_tag_name('tr'):
        word_list.append(i.text.split(' '))
    
    print(pd.DataFrame(word_list))