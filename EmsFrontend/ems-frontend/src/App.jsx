import { useState } from "react";
import "./App.css";
import ListOfEmployee from "./components/ListOfEmployee";
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <HeaderComponent />
      <ListOfEmployee />
      <FooterComponent />
    </>
  );
}

export default App;
