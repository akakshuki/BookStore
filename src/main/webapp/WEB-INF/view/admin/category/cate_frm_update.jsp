<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Edit Category</h1>
		<div class="md-5 lg-5 xs-12">
			<form action="/cates_change" method="post">
				<input type="hidden" name="idc" value="${cate_item.idc}" />
				<div class="form-group">
					<div><small id="nameHelp" class="form-text text-muted">Enter
							Category Name</small></div>
					<div>
						<input type="text" class="form-control" id="inName" name="nameC"
							value="${cate_item.nameC}" aria-describeby="nameHelp">
					</div>
						<div><small id="nameHelp" class="form-text text-muted">Status</small></div>
					<div>
						<input type="checkbox" class="form-control" id="inName" name="statusC"
							aria-describedy="nameHelp">
					</div>

				</div>
				<button type="submit" class="btn btn-primary">Save Change</button>
			</form>
		</div>
	</div>

</body>
</html>