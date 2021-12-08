/**
 * 
 */

function createLocation(){
	var locationName = document.getElementById("locationName").value;
	var address = document.getElementById("address").value;
	
	console.log(locationName, address);
	console.log(JSON.stringify({
	        locationName: locationName,
	        address: address,
	    }))
	
	// POST request using fetch()
	fetch("http://localhost:9999/date/location/create", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
	        locationName: locationName,
	        address: address,
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function createProfile(){
	var personalInfoName = document.getElementById("personalInfoName").value;
	var age = document.getElementById("age").value;
	var pronouns = document.getElementById("pronouns").value;
	var sex = document.getElementById("sex").value;
	
	console.log(personalInfoName, age, pronouns, sex);
	
	// POST request using fetch()
	fetch("http://localhost:9999/date/profile/create", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
	        personalInfoName: personalInfoName,
	        age: age,
			pronouns: pronouns,
			sex: sex
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function editProfile(){
	var personalInfoID = document.getElementById("personalInfoID").value;
	var personalInfoName = document.getElementById("personalInfoName").value;
	var age = document.getElementById("age").value;
	var pronouns = document.getElementById("pronouns").value;
	var sex = document.getElementById("sex").value;
	
	console.log(personalInfoID, personalInfoName, age, pronouns, sex);
	
	// POST request using fetch()
	fetch("http://localhost:9999/date/profile/edit", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
			personalInfoID: personalInfoID,
	        personalInfoName: personalInfoName,
	        age: age,
			pronouns: pronouns,
			sex: sex
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function deleteProfile(){
	var personalInfoID = document.getElementById("personalInfoID").value;
	//  GET request using fetch()
	fetch("http://localhost:9999/date/profile/delete?personalInfoID=" + personalInfoID)
}


function createContact(){
	var phoneNumber = document.getElementById("phoneNumber").value;
	var email = document.getElementById("email").value;
	var facebookLink = document.getElementById("facebookLink").value;
	var image = document.getElementById("image").value;
	var personalInfoID = document.getElementById("personalInfoID").value;
	var personalInfoName = document.getElementById("personalInfoName").value;
	var age = document.getElementById("age").value;
	var pronouns = document.getElementById("pronouns").value;
	var sex = document.getElementById("sex").value;
	
	console.log(phoneNumber, email, facebookLink, image, personalInfoID, personalInfoName, age, pronouns, sex);
	
	// POST request using fetch()
	fetch("http://localhost:9999/date/contactinformation/create", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
			phoneNumber: phoneNumber,       
			email: email,
			facebookLink: facebookLink,
			image: image,
			personalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			}
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function editContact(){
	var id = document.getElementById("id").value;
	var phoneNumber = document.getElementById("phoneNumber").value;
	var email = document.getElementById("email").value;
	var facebookLink = document.getElementById("facebookLink").value;
	var image = document.getElementById("image").value;
	var personalInfoID = document.getElementById("personalInfoID").value;
	var personalInfoName = document.getElementById("personalInfoName").value;
	var age = document.getElementById("age").value;
	var pronouns = document.getElementById("pronouns").value;
	var sex = document.getElementById("sex").value;
	
	console.log(id, phoneNumber, email, facebookLink, image, personalInfoID, personalInfoName, age, pronouns, sex);
	
	// POST request using fetch()
	fetch("http://localhost:9999/date/contactinformation/edit", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
			id: id,
			phoneNumber: phoneNumber,       
			email: email,
			facebookLink: facebookLink,
			image: image,
			personalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			}
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function createInterest(){
	var agePreference = document.getElementById("agePreference").value;
	var sexPreference = document.getElementById("sexPreference").value;
	var movieGenre = document.getElementById("movieGenre").value;
	var songGenre = document.getElementById("songGenre").value;
	var faveFood = document.getElementById("faveFood").value;
	var faveHobby = document.getElementById("faveHobby").value;
	var personalInfoID = document.getElementById("personalInfoID").value;
	var personalInfoName = document.getElementById("personalInfoName").value;
	var age = document.getElementById("age").value;
	var pronouns = document.getElementById("pronouns").value;
	var sex = document.getElementById("sex").value;
	
	console.log(agePreference, sexPreference, movieGenre, songGenre, faveFood, faveHobby, personalInfoID, personalInfoName, age, pronouns, sex);
	
	// POST request using fetch()
	fetch("http://localhost:9999/date/interest/create", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
			agePreference: agePreference,
			sexPreference: sexPreference,       
			movieGenre: movieGenre,
			songGenre: songGenre,
			faveFood: faveFood,
			faveHobby: faveHobby,
			personalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			}
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function editInterest(){
	var interestID = document.getElementById("interestID").value;
	var agePreference = document.getElementById("agePreference").value;
	var sexPreference = document.getElementById("sexPreference").value;
	var movieGenre = document.getElementById("movieGenre").value;
	var songGenre = document.getElementById("songGenre").value;
	var faveFood = document.getElementById("faveFood").value;
	var faveHobby = document.getElementById("faveHobby").value;
	var personalInfoID = document.getElementById("personalInfoID").value;
	var personalInfoName = document.getElementById("personalInfoName").value;
	var age = document.getElementById("age").value;
	var pronouns = document.getElementById("pronouns").value;
	var sex = document.getElementById("sex").value;
	
	console.log(interestID, agePreference, sexPreference, movieGenre, songGenre, faveFood, faveHobby, personalInfoID, personalInfoName, age, pronouns, sex);
	
	// POST request using fetch()
	fetch("http://localhost:9999/date/interest/edit", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
			interestID: interestID,
			agePreference: agePreference,
			sexPreference: sexPreference,       
			movieGenre: movieGenre,
			songGenre: songGenre,
			faveFood: faveFood,
			faveHobby: faveHobby,
			personalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			}
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function createActivity(){
	var activityName = document.getElementById("activityName").value;
	var date = document.getElementById("date").value;
	var time = document.getElementById("time").value;
	var acceptance = document.getElementById("acceptance").value;
	var inviteePersonalInformation = document.getElementById("inviteePersonalInformation").value;
	var inviterPersonalInformation = document.getElementById("inviterPersonalInformation").value;
	var locationName = document.getElementById("locationName").value;
	var address = document.getElementById("address").value;
	
	console.log(activityName, date, time, acceptance, inviteePersonalInformation, inviterPersonalInformation, locationName, address);
	
	// POST request using fetch()
	fetch("http://localhost:9999/activity/create", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
			activityName : activityName,
			date : date,
			time : time,
			acceptance : acceptance,
			inviteePersonalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			},
			inviterPersonalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			},
			location: {
				locationID : locationID,
				address : address,
				locationName : locationName
			}
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function editActivity(){
	var activityName = document.getElementById("activityName").value;
	var date = document.getElementById("date").value;
	var time = document.getElementById("time").value;
	var acceptance = document.getElementById("acceptance").value;
	var inviteePersonalInformation = document.getElementById("inviteePersonalInformation").value;
	var inviterPersonalInformation = document.getElementById("inviterPersonalInformation").value;
	var locationName = document.getElementById("locationName").value;
	var address = document.getElementById("address").value;
	
	console.log(activityName, date, time, acceptance, inviteePersonalInformation, inviterPersonalInformation, locationName, address);
	
	// POST request using fetch()
	fetch("http://localhost:9999/activity/edit", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
			activityName : activityName,
			date : date,
			time : time,
			acceptance : acceptance,
			inviteePersonalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			},
			inviterPersonalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			},
			location: {
				locationID : locationID,
				address : address,
				locationName : locationName
			}
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function viewMatchedProfiles(){
	var personalInfoName = document.getElementById("personalInfoName").value;
	var age = document.getElementById("age").value;
	var pronouns = document.getElementById("pronouns").value;
	var sex = document.getElementById("sex").value;
	
	console.log(personalInfoName, age, pronouns, sex);
	
	// POST request using fetch()
	fetch("http://localhost:9999/date/viewmatch", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
	        personalInfoName: personalInfoName,
	        age: age,
			pronouns: pronouns,
			sex: sex
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function viewSentInvites(){
	var activityName = document.getElementById("activityName").value;
	var date = document.getElementById("date").value;
	var time = document.getElementById("time").value;
	var acceptance = document.getElementById("acceptance").value;
	var inviteePersonalInformation = document.getElementById("inviteePersonalInformation").value;
	var inviterPersonalInformation = document.getElementById("inviterPersonalInformation").value;
	var locationName = document.getElementById("locationName").value;
	var address = document.getElementById("address").value;
	
	console.log(activityName, date, time, acceptance, inviteePersonalInformation, inviterPersonalInformation, locationName, address);
	
	// POST request using fetch()
	fetch("http://localhost:9999/date/viewsent", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
			activityName : activityName,
			date : date,
			time : time,
			acceptance : acceptance,
			inviteePersonalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			},
			inviterPersonalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			},
			location: {
				locationID : locationID,
				address : address,
				locationName : locationName
			}
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}


function viewReceivedInvites(){
	var activityName = document.getElementById("activityName").value;
	var date = document.getElementById("date").value;
	var time = document.getElementById("time").value;
	var acceptance = document.getElementById("acceptance").value;
	var inviteePersonalInformation = document.getElementById("inviteePersonalInformation").value;
	var inviterPersonalInformation = document.getElementById("inviterPersonalInformation").value;
	var locationName = document.getElementById("locationName").value;
	var address = document.getElementById("address").value;
	
	console.log(activityName, date, time, acceptance, inviteePersonalInformation, inviterPersonalInformation, locationName, address);
	
	// POST request using fetch()
	fetch("http://localhost:9999/date/viewreceived", {
	    //mode: "no-cors", 
	    // Adding method type
	    method: "POST",
	     
	    // Adding body or contents to send
	    body: JSON.stringify({
			activityName : activityName,
			date : date,
			time : time,
			acceptance : acceptance,
			inviteePersonalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			},
			inviterPersonalInformation: {
				personalInfoID: personalInfoID,
				personalInfoName: personalInfoName,
		        age: age,
				pronouns: pronouns,
				sex: sex
			},
			location: {
				locationID : locationID,
				address : address,
				locationName : locationName
			}
	    }),
	     
	    // Adding headers to the request
	    headers: {
	        "Content-type": "application/json; charset=UTF-8",
	    }
	})
	 
	// Converting to JSON
	.then(response => response.json())
	 
	// Displaying results to console
	.then(json => console.log(json));
}