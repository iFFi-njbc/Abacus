import React, { useState } from 'react';
import axios from 'axios';

const RegisterForm = () => {

    // const [username, setUsername] = useState('');
    // const [email, setEmail] = useState('');
    // const [password, setPassword] = useState('');
     // Handle form submission

     const [user, setUser] = useState({
      name: '',
      email: '',
      password: '',
    });

     const handleSubmit = async (e) => {
      e.preventDefault();
    
      try {
        const response = await axios.post('http://localhost:9090/users', user);
    
        console.log('User registered:', response.data);

        alert('Registration successful! You can now log in.');

      } catch (error) {
        console.error('Registration failed:', error);
        alert('Registration failed. Please try again later.');
       
      }
    };


  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label>Username:</label>
        <input
          type="text"
          value={user.name}
          onChange={(e) => setUser({ ...user, name: e.target.value })}

        />
      </div>
      <div>
        <label>Email:</label>
        <input
          type="email"
          value={user.email}
          onChange={(e) => setUser({ ...user, email: e.target.value })}
        />
      </div>
      <div>
        <label>Password:</label>
        <input
          type="password"
          value={user.password}
          onChange={(e) => setUser({ ...user, password: e.target.value })}
        />
      </div>
      <button type="submit">Register</button>
    </form>
  );
};

export default RegisterForm;
