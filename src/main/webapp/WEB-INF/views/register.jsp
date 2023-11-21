<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Registration Page</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <h2 class="card-title text-center">Register</h2>
                        
                        <form action="/register" method="post">
                            <div class="mb-3">
                                <label for="newUsername" class="form-label">New Username:</label>
                                <input type="text" class="form-control" id="newUsername" name="newUsername" required>
                            </div>
                            
                            <div class="mb-3">
                                <label for="newPassword" class="form-label">New Password:</label>
                                <input type="password" class="form-control" id="newPassword" name="newPassword" required>
                            </div>
                            
                            <button type="submit" class="btn btn-success">Register</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
