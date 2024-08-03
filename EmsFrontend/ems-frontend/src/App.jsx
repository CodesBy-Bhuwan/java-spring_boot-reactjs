import { useState } from "react";
import "./App.css";
import ListOfEmployee from "./components/ListOfEmployee";
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent";
import {BrowserRouter, Route, Routes} from "react-router-dom"
import EmployeeComponent from "./components/EmployeeComponent";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
    <BrowserRouter>
      <HeaderComponent />
      <Routes>
        {/* This is when we click on link for like: http://localhost:3000 */}
        <Route path="/" element={ <ListOfEmployee />} > </Route>
        {/* Similarly for other paths we do the same difference is assign the path */}
        <Route path="/employees" element={<ListOfEmployee />}></Route>
        {/* path and navigate has to be same since this shows the actual path relation */}
        <Route path="/add-employee" element = {EmployeeComponent}></Route>
      </Routes>
      <FooterComponent />
      </BrowserRouter>
    </>
  );
}

export default App;
