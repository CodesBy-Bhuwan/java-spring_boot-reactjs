import { useState } from 'react'
import './App.css'
import Home from './Home'
import ListOfEmployee from './components/ListOfEmployee'
import HeaderComponent from './components/HeaderComponent'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <HeaderComponent />
      <ListOfEmployee />
    </>
  )
}

export default App
