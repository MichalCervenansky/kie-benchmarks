package mortgage;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Validation Error")
public class ValidationError implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Cause of Error")
    @org.kie.api.definition.type.Position(value = 0)
    private String cause;

    public ValidationError() {
    }

    public ValidationError(String cause) {
        this.cause = cause;
    }

    public String getCause() {
        return this.cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}