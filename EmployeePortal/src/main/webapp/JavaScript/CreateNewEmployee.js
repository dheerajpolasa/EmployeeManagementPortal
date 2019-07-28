function validateForm() {
	console.log("Hello");
	var letters = /^[A-Za-z]+$/;
	var first_name = document.forms["emp"]["employeeFirstName"].value;
	if (first_name == null || first_name == "") {
		alert("First Name must be filled out");
		return false;
	}

	if (!first_name.match(letters)) {
		alert("First Name is Invalid!");
		return false;
	}
	var last_name = document.forms["emp"]["employeeLastName"].value;
	if (last_name == null || last_name == "") {
		alert("Last Name must be filled out");
		return false;
	}
	if (!last_name.match(letters)) {
		alert("Last Name is Invalid");
		return false;
	}
	var blood_group = document.forms["emp"]["bloodGroup"].value;
	var blood_group_pattern = /(A|B|AB|O)[-+]/;
	if (blood_group == null || blood_group == "") {
		alert("Blood Group must be filled out")
		return false;
	}
	if (!blood_group.match(blood_group_pattern)) {
		alert("Enter the correct blood group")
		return false;
	}
	var age = document.forms["emp"]["age"].value;
	age = parseInt(age);
	if (age == null || age == "") {
		alert("Age must be filled out");
		return false;
	} else if (age < 1 || age > 100) {
		alert("The age must be a number between 1 and 100");
		return false;
	} else if (isNaN(age)) {
		alert("Age should be number");
		return false;
	}
	var dob = document.forms["emp"]["dateOfBirth"].value;
	var dateformat = /^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$/;
	if (dob == null || dob == "") {
		alert("Date of Birth must be filled out");
		return false;
	}
	if (!dob.match(dateformat)) {
		alert("Invalid date format!");
		return false;
	}

	var HRA = document.forms["emp"]["houseRentAllowance"].value;
	HRA = parseInt(HRA);
	if (HRA == null || HRA == "") {
		alert("HRA must be filled out");
		return false;
	} else if (HRA < 1) {
		alert("HRA should not be a negative number");
		return false;
	} else if (isNaN(HRA)) {
		alert("HRA is a number");
		return false;
	}

	var TRAVEL_ALLOWANCE = document.forms["emp"]["travelAllowance"].value;
	TRAVEL_ALLOWANCE = parseInt(TRAVEL_ALLOWANCE);
	if (TRAVEL_ALLOWANCE == null || TRAVEL_ALLOWANCE == "") {
		alert("TRAVEL_ALLOWANCE must be filled out");
		return false;
	} else if (TRAVEL_ALLOWANCE < 1) {
		alert("The TRAVEL_ALLOWANCE should not be a negative number");
		return false;
	} else if (isNaN(TRAVEL_ALLOWANCE)) {
		alert("The TRAVEL_ALLOWANCE must be a number");
		return false;
	}

	var MEDICAL_ALLOWANCE = document.forms["emp"]["medicalAllowance"].value;
	MEDICAL_ALLOWANCE = parseInt(MEDICAL_ALLOWANCE);
	if (MEDICAL_ALLOWANCE == null || MEDICAL_ALLOWANCE == "") {
		alert("MEDICAL_ALLOWANCE must be filled out");
		return false;
	} else if (MEDICAL_ALLOWANCE < 1) {
		alert("MEDICAL_ALLOWANCE should not be a negative number");
		return false;
	} else if (isNaN(MEDICAL_ALLOWANCE)) {
		alert("MEDICAL_ALLOWANCE must be a number");
		return false;
	}

	var BASIC_SALARY = document.forms["emp"]["basicSalary"].value;
	BASIC_SALARY = parseInt(BASIC_SALARY);
	if (BASIC_SALARY == null || BASIC_SALARY == "") {
		alert("BASIC_SALARY must be filled out");
		return false;
	} else if (BASIC_SALARY < 1) {
		alert("BASIC_SALARY should not be a negative number");
		return false;
	} else if (isNaN(BASIC_SALARY)) {
		alert("BASIC_SALARY must be a number");
		return false;
	}
	return true;
}