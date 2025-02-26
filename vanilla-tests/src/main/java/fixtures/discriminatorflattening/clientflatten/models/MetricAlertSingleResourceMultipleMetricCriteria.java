package fixtures.discriminatorflattening.clientflatten.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Specifies the metric alert criteria for a single resource that has multiple metric criteria. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria")
@Fluent
public final class MetricAlertSingleResourceMultipleMetricCriteria extends MetricAlertCriteria {
    /*
     * The list of metric criteria for this 'all of' operation.
     */
    @JsonProperty(value = "allOf")
    private List<String> allOf;

    /**
     * Get the allOf property: The list of metric criteria for this 'all of' operation.
     *
     * @return the allOf value.
     */
    public List<String> getAllOf() {
        return this.allOf;
    }

    /**
     * Set the allOf property: The list of metric criteria for this 'all of' operation.
     *
     * @param allOf the allOf value to set.
     * @return the MetricAlertSingleResourceMultipleMetricCriteria object itself.
     */
    public MetricAlertSingleResourceMultipleMetricCriteria setAllOf(List<String> allOf) {
        this.allOf = allOf;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
