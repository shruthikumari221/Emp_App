package entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Employees")
public class Empentity {

    @Id
    private String _id;
    private String Employeename;
    private String Employeeaddress;
    private String mobile;


    public Empentity(String _id, String Employeename, String Employeeaddress, String mobile) {
        this._id = _id;
        this.Employeename = Employeename;
        this.Employeeaddress = Employeeaddress;
        this.mobile = mobile;
    }


    public Empentity() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getEmployeename() {
        return Employeename;
    }

    public void setEmployeename(String Employeename) {
        this.Employeename = Employeename;
    }

    public String getEmployeeaddress() {
        return Employeeaddress;
    }

    public void setEmployeeaddress(String Employeeaddress) {
        this.Employeeaddress = Employeeaddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "_id='" + _id + '\'' +
                ", Employeename='" + Employeename + '\'' +
                ", Employeeaddress='" + Employeeaddress + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}