import {
  Route,
  BrowserRouter as Router,
  Switch,
  Redirect,
} from "react-router-dom";
import { User, Home, Login, Register } from "./pages";
import { Navigation } from "./components/Navigation/Navigation";
import { useEffect } from "react";

function App() {
  useEffect(() => {}, [localStorage]);
  return (
    <Router>
      <Navigation />
      <Switch>
        <Route exact path="/" component={Home}>
          {!localStorage.getItem("userName") ? (
            <Redirect to="/user" />
          ) : (
            <Redirect to="/login" />
          )}
        </Route>
        <Route path="/user" component={User} />
        <Route path="/login" component={Login} />
        <Route path="/register" component={Register} />
      </Switch>
    </Router>
  );
}

export default App;
