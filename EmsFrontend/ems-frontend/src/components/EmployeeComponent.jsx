import React, { useState } from 'react'

const EmployeeComponent = () => {

  //Step 1: Defining useState Variable
  const[firstName, setFirstName] = useState('')
  const[lastName, setLastName] = useState('')
  const[email, setEmail] = useState('')
  const[address, setAddress] = useState('')  

  return (
    // Step 2: Adding container
    <div>
        <div className="row">
          <div className="card">
            <h2 className='text-center'>Add Employee</h2>
            <div className="card-body">
              <form >
                <div className="form-group mb-2">
                  <label className='form-label'>First Name</label>
                  <input 
                  type="text"
                  placeholder='Enter First Name here!'
                  name='firstName'
                  value={firstName}
                  className='form-control'
                   />
                </div>
              </form>
            </div>

          </div>
        </div>
    </div>
  )
}

export default EmployeeComponent