<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>31レジシステム</title>
</head>
<body>
   <img src ="file:///C:/pleiades/workspace/SampleProject/WebContent/WEB-INF/img/31ロゴ.png"
    alt = "ロゴマーク"
    width = "206"
    height = "70">

   <h2>合計金額</h2>

   <form action="/SampleProject/ServletTest" method="post">
      <h2>受注金額</h2>
      <input type = "text" name = "txt" size = "20">
   </form>

   <h2>差額</h2>

   <p>
			<input type="submit" value="戻る">
			<input type="reset" value="決済を行う">
   </p>

    <table border="1">
        <tr>
           <td>num</td><td>/</td><td>*</td><td>-</td>
        </tr>
        <tr>
           <td>7</td><td>8</td><td>9</td><td rowspan="2">+</td>
        </tr>
        <tr>
           <td>4</td><td>5</td><td>6</td>
        </tr>
        <tr>
           <td>1</td><td>2</td><td>3</td><td rowspan="2">enter</td>
        </tr>
        <tr>
           <td colspan="2">0</td><td>.</td>
        </tr>
   </table>


</body>
</html>