<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Login Page</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
	integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ"
	crossorigin="anonymous">

<link rel="stylesheet" href="css/signin.css" />

</head>

<body>
	<div class="container justify-content-center col-6" id="maincontainer">

		<div class="row">

			<div class="col">
				<h2 class="form-signin-heading">Sign in</h2>
				<hr />
			</div>

		</div>

		<div class="row" id="login-content">

			<div class="col-md-6" id="left-div">

				<div class="row">
					<div class="col">
						<h5>Use other Accounts</h5>
					</div>
				</div>

				<div class="row">
					<div class="col hidden-sm-down">
						<p>You can also sign in using your Facebook or Google Account.</p>
					</div>
				</div>

				<div class="row">
					<div class="col col-md-12">
						<p>
							<button type="button"
								class="btn btn-primary text-white social btn-block btn-responsive" id="facebook">Login
								with Facebook</button>
						</p>
					</div>
				</div>

				<div class="row">
					<div class="col col-md-12">
						<p>
							<button type="button" class="btn bg-inverse text-white social btn-block btn-responsive">Login
								with Google</button>
						</p>
					</div>
				</div>

			</div>

			<div class="col-md-6">

				<div class="row">
					<div class="col text-center">
						<h5>Use Your Account</h5>
					</div>
				</div>

				<div class="row">
					<div class="col">
						<form class="form-signin">

							<label for="inputEmail" class="sr-only">Email address</label> <input
								id="inputEmail" class="form-control" placeholder="Email address"
								required="" autofocus="" type="email"> <label
								for="inputPassword" class="sr-only">Password</label> <input
								id="inputPassword" class="form-control" placeholder="Password"
								required="" type="password">

							<button class="btn btn-lg btn-info text-white btn-block" id="signin-button" type="submit">Sign
								in</button>
						</form>
					</div>
				</div>
				
				<div class="row">
					<div class="col text-center"><a href="#">Forgot your password?</a></div>
				</div>
			</div>

		</div>

	</div>
	<!-- /container -->

	<!-- jQuery first, then Tether, then Bootstrap JS. -->
	<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js"
		integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n"
		crossorigin="anonymous"></script>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"
		integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
		crossorigin="anonymous"></script>

	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"
		integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn"
		crossorigin="anonymous"></script>


</body>
</html>