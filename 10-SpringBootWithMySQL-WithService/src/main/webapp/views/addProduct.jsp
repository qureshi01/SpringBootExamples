<center>
	<h1>ENTER PRODUCT DETAILS</h1>
</center>

<form action="/success">
	<table>
		<tr>
			<th>P_ID</th>
			<td>
				<input type="number" name="p_id" >	
			</td>
		</tr>
		
		<tr>
			<th>P_NAME</th>
			<td>
				<select name="p_name">
					<option value="">Select Product</option>
					<option value="laptop">Laptop</option>
					<option value="mobile">Mobile</option>
					<option value="watch">Watch</option>
					<option value="charger">Charger</option>
				</select>	
			</td>
		</tr>
		
		<tr>
			<th>P_COST</th>
			<td>
				<input type="number" name="p_cost" >	
			</td>
		</tr>
		
		<tr>
			<th>P_QUANTITY</th>
			<td>
				<select name="p_quantity">
					<option value="">Select Quantity</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>	
			</td>
		</tr>
		
		<tr>
			<th>P_IMAGE</th>
			<td>
				<input type="text" name="p_image" >	
			</td>
		</tr>
		
		<tr>
			<td>
				<input type="submit" value="Add Product">
			</td>
		</tr>
		
	</table>
</form>