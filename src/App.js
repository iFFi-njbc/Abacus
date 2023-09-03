import React, { useState } from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import LoginPage from './Components/LoginPage';
import RegisterPage from './Components/RegisterPage';
import HomePage from './Components/HomePage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [userName, setUserName] = useState('');

  const handleLogin = (name) => {
    setIsLoggedIn(true);
    setUserName(name);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
    setUserName('');
  };

  return (
    <Router>
      <div>
        <Switch>
          <Route path="/" exact>
            {isLoggedIn ? (
              <HomePage userName={userName} handleLogout={handleLogout} />
            ) : (
              <LoginPage onLogin={handleLogin} />
            )}
          </Route>
          <Route path="/register" component={RegisterPage} />
          <Route path="/home">
            {isLoggedIn ? (
              <HomePage userName={userName} handleLogout={handleLogout} />
            ) : (
              <LoginPage onLogin={handleLogin} />
            )}
          </Route>
        </Switch>
      </div>
    </Router>
  );
}

export default App;
