import React, {useEffect, useState} from 'react'
import { listEmployees } from '../services/EmployeeService'

const ListOfEmployee = () => {

    const [employees, setEmployees] = useState([])

    useEffect(()=> {
        listEmployees().then((response)=>{
            setEmployees(response.data);
        }).catch(error => {
            console.error(error);
        })
    }, [])


    {/*
    const dummyDbms = [
        {
            "id":1,
            "firstName":"Ram",
            "lastName":"Mar",
            "address":"Kathmandu",
            "email":"ram@gmail.com"
        },
        {
            "id":2,
            "firstName":"Ram2",
            "lastName":"Mar2",
            "address":"Kathmandu2",
            "email":"ram2@gmail.com"
        },
        {
            "id":3,
            "firstName":"Ram3",
            "lastName":"Mar3",
            "address":"Kathmandu",
            "email":"ram3@gmail.com"
        },
        {
            "id":4,
            "firstName":"Ram4",
            "lastName":"Mar4",
            "address":"Kathmandu",
            "email":"ram4@gmail.com"
        },
        {
            "id":5,
            "firstName":"Ram5",
            "lastName":"Mar5",
            "address":"Kathmandu",
            "email":"ram5@gmail.com"
        },
        {
            "id":6,
            "firstName":"Ram6",
            "lastName":"Mar6",
            "address":"Kathmandu",
            "email":"ram6@gmail.com"
        },
        {
            "id":7,
            "firstName":"Ram7",
            "lastName":"Mar7",
            "address":"Kathmandu",
            "email":"ram7@gmail.com"
        },
        {
            "id":8,
            "firstName":"Ram8",
            "lastName":"Ma8r",
            "address":"Kathmandu",
            "email":"ram8@gmail.com"
        },
        {
            "id":9,
            "firstName":"Ram9",
            "lastName":"Mar9",
            "address":"Kathmandu",
            "email":"r9am@gmail.com"
        },
    ]
    */}

  return (
    <div className='container'>
    <h2 className='text-center'>List of Employees</h2>
    <table className='table table-striped table-bordered'>
        <thead>
            <tr>
                <th>Employee Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Address</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            {
                employees.map(employee =>
                <tr key={employee.id}>
                    <td>{employee.id}</td>
                    <td>{employee.firstName}</td>
                    <td>{employee.lastName}</td>
                    <td>{employee.address}</td>
                    <td>{employee.email}</td>

                </tr>
                
                )
            }
        
        </tbody>
    </table>

    </div>
  )
}

export default ListOfEmployee