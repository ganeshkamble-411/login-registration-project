import React, { useState } from "react";
import Login from "./pages/Login";
import Registration from "./pages/Registration";

function App() {
  const [isLogin, setIsLogin] = useState(true);

  return (
    <div>
      {isLogin ? <Login /> : <Registration />}
      <div style={{ textAlign: "center", marginTop: "10px" }}>
        <button onClick={() => setIsLogin(!isLogin)}>
          {isLogin
            ? " Registration"
            : " Login"}
        </button>
      </div>
    </div>
  );

  // return (
  //   <div>
  //     <h1 style={{ textAlign: "center", marginTop: "50px" }}>Welcome to the App</h1>
  //   </div>
  // );
}

export default App;
