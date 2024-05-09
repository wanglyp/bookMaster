//MSG連想配列
const msg = {
	MSG0001: "本IDを入力してください。",
	MSG0002: "本IDは半角英数字で入力してください。",
	MSG0006: "本タイトルを入力してください。",
	MSG0007: "著者名を入力してください。",
	MSG0008: "出版社を入力してください。",
	MSG0009: "出版年月日を入力してください。",
	MSG0010: "出版年月日は半角数字で入力してください。"
}

//サーバーからのメッセージ処理
const messageFromServer = document.getElementById("message").value;

if (messageFromServer != '') {
	alert(messageFromServer);
}

//正規表現
const regex = {
	regex1: /\S/, //空白文字
	regex2: /^[0-9a-zA-Z]*$/, //半角英数字
	regex3: /^[0-9]*$/ //半角数字
}

//本ID入力チェック
function checkBookId() {
	const bookId = document.getElementById("bookId").value;

	//空白文字チェック
	if (!regex.regex1.test(bookId)) {
		alert(msg.MSG0001);

		return false;
	}
	//半角英数字チェック
	else if (!regex.regex2.test(bookId)) {
		alert(msg.MSG0002);

		return false;
	} else {
		return true;
	}
}

//本タイトルチェック
function checkBookTitle() {
	const bookTitle = document.getElementById("bookTitle").value;

	//空白文字チェック
	if (!regex.regex1.test(bookTitle)) {
		alert(msg.MSG0006);

		return false;
	}

	return true;
}

//著者名チェック
function checkAuthorName() {
	const authorName = document.getElementById("authorName").value;

	//空白文字チェック
	if (!regex.regex1.test(authorName)) {
		alert(msg.MSG0007);

		return false;
	}

	return true;
}

//出版社チェック
function checkPublisher() {
	const publisher = document.getElementById("publisher").value;

	//空白文字チェック
	if (!regex.regex1.test(publisher)) {
		alert(msg.MSG0008);

		return false;
	}

	return true;
}

//出版年チェック
function checkYear() {
	const year = document.getElementById("year").value;

	//空白文字チェック
	if (!regex.regex1.test(year)) {
		alert(msg.MSG0009);

		return false;
	}
	//半角数字チェック
	if (!regex.regex3.test(year)) {
		alert(msg.MSG0010);

		return false;
	}

	return true;
}

//出版月チェック
function checkMonth() {
	const month = document.getElementById("month").value;

	//空白文字チェック
	if (!regex.regex1.test(month)) {
		alert(msg.MSG0009);

		return false;
	}
	//半角数字チェック
	if (!regex.regex3.test(month)) {
		alert(msg.MSG0010);

		return false;
	}

	return true;
}

//出版日チェック
function checkDay() {
	const day = document.getElementById("day").value;

	//空白文字チェック
	if (!regex.regex1.test(day)) {
		alert(msg.MSG0009);

		return false;
	}
	//半角数字チェック
	if (!regex.regex3.test(day)) {
		alert(msg.MSG0010);

		return false;
	}

	return true;
}

//検索を押下の処理
function searchButton() {
	return document.getElementById("searchButton");
}
searchButton().onclick = function() {

	//入力チェック
	if (checkBookId()) {
		//サーバーへ伝送する
		document.getElementById("bookForm").action = "/searchBook";
	} else {
		return false;
	}
}

//追加を押下の処理
function insertButton() {
	return document.getElementById("insertButton");
}
insertButton().onclick = function() {

	//入力チェック
	if (!checkBookId()) {
		return false;
	}
	if (!checkBookTitle()) {
		return false;
	}
	if (!checkAuthorName()) {
		return false;
	}
	if (!checkPublisher()) {
		return false;
	}
	if (!checkYear()) {
		return false;
	}
	if (!checkMonth()) {
		return false;
	}
	if (!checkDay()) {
		return false;
	}

	//サーバーへ伝送する
	document.getElementById("bookForm").action = "/insertBook";
}

//更新押下の処理
function updateButton() {
	return document.getElementById("updateButton");
}
updateButton().onclick = function() {

	//入力チェック
	if (!checkBookId()) {
		return false;
	}
	if (!checkBookTitle()) {
		return false;
	}
	if (!checkAuthorName()) {
		return false;
	}
	if (!checkPublisher()) {
		return false;
	}
	if (!checkYear()) {
		return false;
	}
	if (!checkMonth()) {
		return false;
	}
	if (!checkDay()) {
		return false;
	}

	//サーバーへ伝送する
	document.getElementById("bookForm").action = "/updateBook";
}

//削除を押下の処理
function deleteButton() {
	return document.getElementById("deleteButton");
}
deleteButton().onclick = function() {

	//入力チェック
	if (checkBookId()) {
		//サーバーへ伝送する
		document.getElementById("bookForm").action = "/deleteBook";
	} else {
		return false;
	}
}

//クリアを押下処理
function clearButton() {
	return document.getElementById("clearButton");
}
clearButton().onclick = function() {
	document.getElementById("bookId").value = "";
	document.getElementById("bookTitle").value = "";
	document.getElementById("authorName").value = "";
	document.getElementById("publisher").value = "";
	document.getElementById("year").value = "";
	document.getElementById("month").value = "";
	document.getElementById("day").value = "";
}

//閉めるリンクを押下の処理
function closeLink() {
	return document.getElementById("closeLink");
}
closeLink().onclick = function() {
	window.close();
}
