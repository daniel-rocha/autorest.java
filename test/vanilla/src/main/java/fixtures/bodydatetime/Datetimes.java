/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetime;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import fixtures.bodydatetime.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import org.threeten.bp.OffsetDateTime;

/**
 * An instance of this class provides access to all the operations defined in
 * Datetimes.
 */
public interface Datetimes {
    /**
     * Get null datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getNull();

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getNullAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get null datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getNullWithRestResponseAsync();

    /**
     * Get null datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getNullAsync();

    /**
     * Get invalid datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getInvalid();

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getInvalidAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get invalid datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getInvalidWithRestResponseAsync();

    /**
     * Get invalid datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getInvalidAsync();

    /**
     * Get overflow datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getOverflow();

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getOverflowAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get overflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getOverflowWithRestResponseAsync();

    /**
     * Get overflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getOverflowAsync();

    /**
     * Get underflow datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getUnderflow();

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getUnderflowAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get underflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getUnderflowWithRestResponseAsync();

    /**
     * Get underflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getUnderflowAsync();

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putUtcMaxDateTime(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putUtcMaxDateTimeAsync(@NonNull OffsetDateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putUtcMaxDateTimeWithRestResponseAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putUtcMaxDateTimeAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getUtcLowercaseMaxDateTime();

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getUtcLowercaseMaxDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getUtcLowercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value 9999-12-31t23:59:59.9999999z.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getUtcLowercaseMaxDateTimeAsync();

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getUtcUppercaseMaxDateTime();

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getUtcUppercaseMaxDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getUtcUppercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value 9999-12-31T23:59:59.9999999Z.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getUtcUppercaseMaxDateTimeAsync();

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putLocalPositiveOffsetMaxDateTime(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putLocalPositiveOffsetMaxDateTimeAsync(@NonNull OffsetDateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putLocalPositiveOffsetMaxDateTimeWithRestResponseAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putLocalPositiveOffsetMaxDateTimeAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getLocalPositiveOffsetLowercaseMaxDateTime();

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getLocalPositiveOffsetLowercaseMaxDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getLocalPositiveOffsetLowercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999+14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getLocalPositiveOffsetLowercaseMaxDateTimeAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999+14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getLocalPositiveOffsetUppercaseMaxDateTime();

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999+14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getLocalPositiveOffsetUppercaseMaxDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999+14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getLocalPositiveOffsetUppercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999+14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getLocalPositiveOffsetUppercaseMaxDateTimeAsync();

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putLocalNegativeOffsetMaxDateTime(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putLocalNegativeOffsetMaxDateTimeAsync(@NonNull OffsetDateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putLocalNegativeOffsetMaxDateTimeWithRestResponseAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put max datetime value with positive numoffset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putLocalNegativeOffsetMaxDateTimeAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999-14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getLocalNegativeOffsetUppercaseMaxDateTime();

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999-14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getLocalNegativeOffsetUppercaseMaxDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999-14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getLocalNegativeOffsetUppercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31T23:59:59.9999999-14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getLocalNegativeOffsetUppercaseMaxDateTimeAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getLocalNegativeOffsetLowercaseMaxDateTime();

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getLocalNegativeOffsetLowercaseMaxDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getLocalNegativeOffsetLowercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value with positive num offset 9999-12-31t23:59:59.9999999-14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getLocalNegativeOffsetLowercaseMaxDateTimeAsync();

    /**
     * Put min datetime value 0001-01-01T00:00:00Z.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putUtcMinDateTime(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00Z.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putUtcMinDateTimeAsync(@NonNull OffsetDateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put min datetime value 0001-01-01T00:00:00Z.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putUtcMinDateTimeWithRestResponseAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00Z.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putUtcMinDateTimeAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Get min datetime value 0001-01-01T00:00:00Z.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getUtcMinDateTime();

    /**
     * Get min datetime value 0001-01-01T00:00:00Z.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getUtcMinDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get min datetime value 0001-01-01T00:00:00Z.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getUtcMinDateTimeWithRestResponseAsync();

    /**
     * Get min datetime value 0001-01-01T00:00:00Z.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getUtcMinDateTimeAsync();

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putLocalPositiveOffsetMinDateTime(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putLocalPositiveOffsetMinDateTimeAsync(@NonNull OffsetDateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putLocalPositiveOffsetMinDateTimeWithRestResponseAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putLocalPositiveOffsetMinDateTimeAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getLocalPositiveOffsetMinDateTime();

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getLocalPositiveOffsetMinDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getLocalPositiveOffsetMinDateTimeWithRestResponseAsync();

    /**
     * Get min datetime value 0001-01-01T00:00:00+14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getLocalPositiveOffsetMinDateTimeAsync();

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putLocalNegativeOffsetMinDateTime(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putLocalNegativeOffsetMinDateTimeAsync(@NonNull OffsetDateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putLocalNegativeOffsetMinDateTimeWithRestResponseAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putLocalNegativeOffsetMinDateTimeAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getLocalNegativeOffsetMinDateTime();

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getLocalNegativeOffsetMinDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getLocalNegativeOffsetMinDateTimeWithRestResponseAsync();

    /**
     * Get min datetime value 0001-01-01T00:00:00-14:00.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getLocalNegativeOffsetMinDateTimeAsync();
}
