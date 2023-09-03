import React, { useState } from 'react';
import axios from 'axios';
import { Link, useHistory } from 'react-router-dom'; // Import useHistory
import RegisterPage from './RegisterPage';
import './LoginForm.css';

const LoginForm = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [name, setName] = useState('');
  const history = useHistory(); // Initialize useHistory

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.get('http://localhost:9090/users', {
        params: {
          email: email,
          password: password,
        },
      });

      if (response.data.userId) {
        setIsLoggedIn(true);
        setName(response.data.name);
        history.push(`/home/${response.data.name}`); // Redirect to homepage with username
      } else {
        setIsLoggedIn(false);
        setName('');
      }
    } catch (error) {
      console.error('Login failed:', error);
      setIsLoggedIn(false);
      setName('');
    }
  };

  return (
    <div className="login-form-container">
      <h2>Login</h2>
      <form onSubmit={handleSubmit} className="login-form">
        {/* Email Input */}
        <div className="input-container">
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            className="input-field"
          />
        </div>
        {/* Password Input */}
        <div className="input-container">
          <label htmlFor="password">Password:</label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            className="input-field"
          />
        </div>
        {/* Submit Button */}
        <button type="submit" className="submit-button">Login</button>
      </form>
      {/* Display Login Status */}
      <p className={isLoggedIn ? 'success-message' : 'error-message'}>
        {isLoggedIn ? `Hello ${name}, you are logged in.` : 'Login failed. Please check your credentials.'}
      </p>
      <p>
      <p>If you are not registered, <a href="/register">go to the registration page</a>.</p>
      </p>
    </div>
  );
};

export default LoginForm;
