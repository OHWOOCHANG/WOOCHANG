<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico" />
<script type="text/javascript" 
src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#speak').click(function(){
		$('#myaudio').stop();
		$('#myaudio').attr('src','text2speechAction?&' + $('#myform').serialize());
		$('#myaudio').attr('autoplay','autoplay');
	});
});
</script>
</head>
<body>
<form id="myform" method="post">
text2speech sample example<br/>
<textarea rows="7" cols="40" name="statement">
There's a lady who's sure
All that glitters is gold
And she's buying a stairway to heaven

When she gets there she knows
If the stores are all closed, with a word
she can get what she came for
Ooh ooh, and she's buying
a stairway to heaven

There's a sign on the wall
But she wants to be sure
Cause you know sometimes
words have two meanings

In a tree by the brook
There's a songbird who sings
Sometimes all of our thoughts
are misgiven

Ooh, it makes me wonder

There's a feeling I get
When I look to the west
And my spirit is crying for leaving

In my thoughts I have seen
rings of smoke through the trees
And the voices of those
who standing looking

Ooh, it makes me wonder
Ooh, it really makes me wonder

And it's whispered that soon
If we all call the tune
Then the piper will lead us to reason

And a new day will dawn
for those who stand long
And the forests will echo with laughter

If there's a bustle in your hedgerow
Don't be alarmed now
It's just a spring clean
for the May queen

Yes, there are two paths you can go by
But in the long run there's still time
to change the road you're on

And it makes me wonder

Your head is humming and it won't go
in case you don't know,
The piper's calling you to join him

Dear lady, can you hear the wind blow
And did you know, your stairway
lies on the whispering wind

And as we wind on down the road
Our shadows taller than our soul
There walks a lady we all know
who shines white light
and wants to show

How everything still turns to gold
And if you listen very hard
The tune will come to you at last
When all are one and one is all
to be a rock and not to roll

And she's buying a stairway to heaven
</textarea><br/>

<select name="voice">
	<c:forEach items="${voices}" var="voice">
		<option>${voice.language} : ${voice.description}</option>
	</c:forEach>
</select><br/>
<input type="button" id="speak" value="읽기" /><br/>
<audio id="myaudio" controls="controls" preload="auto" />
</form>
</body>
</html>