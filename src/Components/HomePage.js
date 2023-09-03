import React from 'react';
import { Link } from 'react-router-dom';
import './HomePage.css'; // Import a separate CSS file for styling

const HomePage = ({ userName, handleLogout }) => {
  return (
    <div className="home-page-container">
      <h1 className="welcome-message">Welcome, <span className="username">{userName}</span>!</h1>
      <button onClick={handleLogout} className="logout-button">
        Logout
      </button>
    </div>
  );
};

export default HomePage;
