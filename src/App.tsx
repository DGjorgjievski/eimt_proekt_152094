import { Route, BrowserRouter as Router, Switch } from "react-router-dom";
import { User, Books, Home } from "./pages";
import { Navigation } from "./components/Navigation/Navigation";

function App() {
  return (
    <Router>
      <Navigation />
      <Switch>
        <Route exact path="/" component={Home} />
        <Route path="/user" component={User} />
      </Switch>
    </Router>
  );
}

export default App;
