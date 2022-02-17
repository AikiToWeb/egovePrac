<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 상세보기</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
<script type="text/javascript">
	$(document).ready(function() {

		// post 전송
		$("#postButton").click(function() {
			var varTitle = $("#title").val();
			var varContent = $("#content").val();
			var varWriter = $("#writer").val();

			var jsonData = {
				title : varTitle,
				content : varContent,
				writer : varWriter

			};

			console.log(jsonData);

			$.ajax({
				type : "post",
				url : "/test/detail/post",
				data : JSON.stringify(jsonData),
				contentType : "application/json; charset=UTF-8",
				success : function(result) {
					alert(result);
				}

			});
		});

		// put 전송
		$("#putButton").click(function() {
			var varTitle = $("#title").val();
			var varContent = $("#content").val();
			var varWriter = $("#writer").val();

			var jsonData = {
				title : varTitle,
				content : varContent,
				writer : varWriter

			};
			console.log(jsonData);

			$.ajax({
				type : "put",
				url : "/test/detail/put",
				data : JSON.stringify(jsonData),
				contentType : "application/json; charset=UTF-8",
				success : function(result) {
					if (result == "SUCCESS") {
						alert("전송 성공");
					} else if (result == "FAIL") {
						alert("전송 실패");
					}

				}

			});
		});

		// xml 전송
		$("#xmlButton").click(function() {
			var varTitle = $("#title").val();
			var varContent = $("#content").val();
			var varWriter = $("#writer").val();
			
			var makeData = "";
			makeData += "<TestBoard>";
			makeData += "<title>좋은 하루</title>";
			makeData +=	"<content>응 아니야~</content>";
			makeData += "<writer>출근맨</writer>";
			makeData += "</TestBoard>";
			
			$.ajax({
				type : "post",
				url : "/test/detail/xml",
				data : makeData,
				contentType : "application/xml; charset=UTF-8",
				success : function(result) {
					if (result == "SUCCESS") {
						alert("전송 성공");
					} else if (result == "FAIL") {
						alert("전송 실패");
					}

				}

			});
		});
	});

</script>
</head>
<body>

	<h1>테스트 디테일</h1>
	<h2>${no}</h2>
	<h1>여러가지 데이터 포맷을 전송한다.</h1>


	제목 :
	<input type="text" id="title" name="title" value="" />
	<br /> 내용 :
	<input type="text" id="content" name="content" value="" />
	<br /> 작성자 :
	<input type="text" id="writer" name="writer" value="" />
	<br />
	<br />

	<button id="postButton">post전송</button>
	<button id="putButton">put전송</button>
	<button id="xmlButton">xml전송</button>


</body>
</html>