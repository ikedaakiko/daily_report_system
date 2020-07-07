package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "worktimes")
@NamedQueries({
    @NamedQuery(
            name = "getAllWorkTimes",
            query = "SELECT e FROM WorkTime AS e ORDER BY e.id DESC"
            ),
    @NamedQuery(
            name = "getWorkTimesCount",
            query = "SELECT COUNT(e) FROM WorkTime AS e"
            ),

})
@Entity
public class WorkTime {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "worktime_timestamp", nullable = false)
    private Timestamp worktime_timestamp;

    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;

    @Column(name = "updated_at", nullable = false)
    private Timestamp updated_at;

    @Column(name = "start_work_time", nullable = false)
    private Timestamp start_work_time;

    @Column(name = "end _work_time", nullable = false)
    private Timestamp end_work_time;

    @Column(name = "rest_time", nullable = false)
    private Timestamp rest_time;



    public Timestamp getStart_work_time() {
        return start_work_time;
    }

    public void setStart_work_time(Timestamp start_work_time) {
        this.start_work_time = start_work_time;
    }

    public Timestamp getEnd_work_time() {
        return end_work_time;
    }

    public void setEnd_work_time(Timestamp end_work_time) {
        this.end_work_time = end_work_time;
    }

    public Timestamp getRest_time() {
        return rest_time;
    }

    public void setRest_time(Timestamp rest_time) {
        this.rest_time = rest_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Timestamp getWorktime_timestamp() {
        return worktime_timestamp;
    }

    public void setWorktime_timestamp(Timestamp worktime_timestamp) {
        this.worktime_timestamp = worktime_timestamp;
    }

}