package mortgage;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Mortgage Applicant")
public class Applicant implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Credit Score")
    @org.kie.api.definition.type.Position(value = 3)
    private Integer creditScore;

    @org.kie.api.definition.type.Label(value = "Annual Income")
    @org.kie.api.definition.type.Position(value = 2)
    private Integer income;

    @org.kie.api.definition.type.Label(value = "Applicant Name")
    @org.kie.api.definition.type.Position(value = 0)
    private String name;

    @org.kie.api.definition.type.Label(value = "Social Security Number")
    @org.kie.api.definition.type.Position(value = 1)
    private Integer ssn;

    public Applicant() {
    }

    public Applicant(String name, Integer ssn, Integer income, Integer creditScore) {
        this.name = name;
        this.ssn = ssn;
        this.income = income;
        this.creditScore = creditScore;
    }

    public Integer getCreditScore() {
        return this.creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Integer getIncome() {
        return this.income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSsn() {
        return this.ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Applicant [creditScore=" + creditScore + ", income=" + income + ", name=" + name + ", ssn=" + ssn + "]";
    }
}