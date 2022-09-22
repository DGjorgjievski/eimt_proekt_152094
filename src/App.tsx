import { Route, BrowserRouter as Router, Switch } from "react-router-dom";
import { User,  Home, Login, Register } from "./pages";
import { Navigation } from "./components/Navigation/Navigation";

function App() {
  return (
    <Router>
      <Navigation />
      <Switch>
        <Route exact path="/" component={Home} />
        <Route path="/user" component={User} />
        <Route path="/login" component={Login}/>
      </Switch>
    </Router>
  );
}

export default App;
