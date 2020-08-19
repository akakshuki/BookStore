<%@ include  file = "ClientHeader.jspf" %>
	<div class="container ">
		<button class="btn btn-success">Add new</button>
		<table class="table table-border table-inverse table-responsive mt-3">
			<thead class="thead-inverse">
				<tr>
					<th>Book Name</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Total</th>
					<th>#</th>
				</tr>
				</thead>
				<tbody class="text-center">
				<c:forEach var="item" items="${listCartUser}">
				<tr >
						<td scope="row">${item.book.nameB}</td>
						<td>${item.book.price}</td>
						<td><input type="number" data-idB="${item.idb}" class="quanitty-input form-control" min=0 max=100 value="${item.quantity}" /></td>
						<td>${item.book.price*item.quantity}</td>
						<td>
							<button data-cartid="${item.idca}"  class="btn-delete-cart btn btn-danger">Delete</button>
						</td>
					</tr>
				</c:forEach>
				</tbody>
		</table>
	</div>

<%@ include file="ClientFooter.jspf"%>
