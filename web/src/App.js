import logo from './logo.svg';
import './App.css';
import {useEffect, useState} from "react";
import axios from "axios";

function App() {

    const [versao,setVersao] = useState([]);

  useEffect(() => {

    axios.get("http://localhost:8080/versao")
        .then((response) => {
            setVersao(response.data);
        })

  }, [])



  return (
    <div className="App">
      <header className="App-header">
       <h1>{versao}</h1>
      </header>
    </div>
  );
}

export default App;
