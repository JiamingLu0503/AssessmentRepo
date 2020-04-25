$(document).ready(function() {
	
	$.ajax({
		url: "https://api.github.com/users"
	}).then(function(data) {		
		var table = $("#usersTable");
		var contents, td1, td2, td3, td4, td5;
		$.each(data, function(idx) {
			td1 = "<tr><td>" + data[idx].id + "</td>";
			td2 = "<td> <img src='" + data[idx].avatar_url + "' width=50 height=50 /></td>";
			td3 = "<td class='username'>" + data[idx].login + "</td>";
			if(idx == 0) {
				td4 = "<td id='photos', rowspan='30'></td>";
			}	
			td5 = "<td>" + data[idx].followers_url + "</td></tr>";
			if(idx == 0) {
				contents += td1 + td2 + td3 + td4 + td5;
			} else {
				contents += td1 + td2 + td3 + td5;
			}	
		})
		table.append(contents);		
	});
	
	$("#usersTable").on("click", "td.username", function() {
		var username = $(this).text();
		$.ajax({
			url: "https://api.github.com/users/" + username + "/followers"
		}).then(function(data) {
			$("#photos").empty();
			var photos = $("#photos");
			var img;
			$.each(data, function(idx) {
				img = document.createElement("img");
				img.src = data[idx].avatar_url;
				img.width = 50;
				img.height = 50;
				photos.append(img);
				photos.append("<br><br>");
			})
			console.log(photos);
		})
	})
	
});