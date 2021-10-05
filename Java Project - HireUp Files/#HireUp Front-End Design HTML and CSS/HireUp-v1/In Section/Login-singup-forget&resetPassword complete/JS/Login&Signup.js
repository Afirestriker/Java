
// this is javascript / JQuery page Link with Login&Signup.html page

// Function to toggle password visibility on login form
function login_showPassword() {
  var show = document.getElementById("password");
  if (show.type === "password") {
    show.type = "text";
  } else {
    show.type = "password";
  }
}

// Function to toggle password visibility on signup form
function signup_showPassword() {
  var show = document.getElementById("p1password");
  if(show.type == "password")
  {
    show.type = "text";
  }
  else
  {
    show.type = "password";
  }
}



