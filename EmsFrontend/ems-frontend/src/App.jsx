import { useState } from 'react'
import './App.css'
import Home from './Home'
import ListOfEmployee from './components/ListOfEmployee'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <ListOfEmployee />
    </>
  )
}

export default App
