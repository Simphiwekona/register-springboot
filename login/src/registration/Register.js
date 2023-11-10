import React, { useState } from 'react'
import './register.css'


function Register() {

    const [loginEmail, setLoginEmail] = useState('');
    const [loginPassword, setLoginPassword] = useState('');
    const [signupName, setSignupName] = useState('');
    const [signupEmail, setSignupEmail] = useState('');
    const [signupPhone, setSignupPhone] = useState('');
    const [signupPassword, setSignupPassword] = useState('');

    const validEmail = (email) => {
        const re = /(.+)@(.+){2,}\.(.+){2,}/;
        return re.test(email.toLowerCase());
    };

    const validPassword = (password) => {
        return password.length > 7;
    };

   

    
    const handleLogin = () => {
        // Add logic for handling login form submission
        console.log('Login:', loginEmail, loginPassword);
    };

    const handleSignup = () => {
        // Add logic for handling signup form submission
        console.log('Signup:', signupName, signupEmail, signupPhone, signupPassword);
    };

    return (
        <div>
            <div className="d-flex justify-content-center align-items-center mt-5">
                <div className="card">
                    <ul className="nav nav-pills mb-3" id="pills-tab" role="tablist">
                        <li className="nav-item text-center">
                            <a className="nav-link active btl" id="pills-home-tab" data-toggle="pill" href="#pills-home" role="tab" aria-controls="pills-home" aria-selected="true">
                                Login
                            </a>
                        </li>
                        <li className="nav-item text-center">
                            <a className="nav-link btr" id="pills-profile-tab" data-toggle="pill" href="#pills-profile" role="tab" aria-controls="pills-profile" aria-selected="false">
                                Signup
                            </a>
                        </li>
                    </ul>

                    <div className="tab-content" id="pills-tabContent">
                        <div className="tab-pane fade show active" id="pills-home" role="tabpanel" aria-labelledby="pills-home-tab">
                            <div className="form px-4 pt-5">
                                <input
                                    type="text"
                                    className="form-control"
                                    placeholder="Email or Phone"
                                    value={loginEmail}
                                    onChange={(e) => setLoginEmail(e.target.value)}
                                />
                                <input
                                    type="text"
                                    className="form-control"
                                    placeholder="Password"
                                    value={loginPassword}
                                    onChange={(e) => setLoginPassword(e.target.value)}
                                />
                                <button className="btn btn-dark btn-block" onClick={handleLogin}>
                                    Login
                                </button>
                            </div>
                        </div>

                        <div className="tab-pane fade" id="pills-profile" role="tabpanel" aria-labelledby="pills-profile-tab">
                            <div className="form px-4">
                                <input
                                    type="text"
                                    className="form-control"
                                    placeholder="Name"
                                    value={signupName}
                                    onChange={(e) => setSignupName(e.target.value)}
                                />
                                <input
                                    type="text"
                                    className="form-control"
                                    placeholder="Email"
                                    value={signupEmail}
                                    onChange={(e) => setSignupEmail(e.target.value)}
                                />
                                <input
                                    type="text"
                                    className="form-control"
                                    placeholder="Phone"
                                    value={signupPhone}
                                    onChange={(e) => setSignupPhone(e.target.value)}
                                />
                                <input
                                    type="text"
                                    className="form-control"
                                    placeholder="Password"
                                    value={signupPassword}
                                    onChange={(e) => setSignupPassword(e.target.value)}
                                />
                                <button className="btn btn-dark btn-block" onClick={handleSignup}>
                                    Signup
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );

}

export default Register;