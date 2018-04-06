/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration.implementation;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodyduration.Durations;
import fixtures.bodyduration.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import org.threeten.bp.Duration;

/**
 * An instance of this class provides access to all the operations defined in
 * Durations.
 */
public final class DurationsImpl implements Durations {
    /**
     * The proxy service used to perform REST calls.
     */
    private DurationsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestDurationTestServiceImpl client;

    /**
     * Initializes an instance of DurationsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DurationsImpl(AutoRestDurationTestServiceImpl client) {
        this.service = RestProxy.create(DurationsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Durations to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface DurationsService {
        @GET("duration/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Duration>> getNull();

        @PUT("duration/positiveduration")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putPositiveDuration(@BodyParam("application/json; charset=utf-8") Duration durationBody);

        @GET("duration/positiveduration")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Duration>> getPositiveDuration();

        @GET("duration/invalid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Duration>> getInvalid();
    }

    /**
     * Get null duration value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Duration object if successful.
     */
    public Duration getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get null duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Duration> getNullAsync(ServiceCallback<Duration> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Duration>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Duration> getNullAsync() {
        return getNullWithRestResponseAsync()
            .flatMapMaybe(new Function<BodyResponse<Duration>, Maybe<Duration>>() {
                public Maybe<Duration> apply(BodyResponse<Duration> res) {
                    return res.body() == null ? Maybe.<Duration>empty() : Maybe.just(res.body());
                }
            }
            );
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Duration value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putPositiveDuration(@NonNull Duration durationBody) {
        putPositiveDurationAsync(durationBody).blockingAwait();
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Duration value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putPositiveDurationAsync(@NonNull Duration durationBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putPositiveDurationAsync(durationBody), serviceCallback);
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Duration value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putPositiveDurationWithRestResponseAsync(@NonNull Duration durationBody) {
        if (durationBody == null) {
            throw new IllegalArgumentException("Parameter durationBody is required and cannot be null.");
        }
        return service.putPositiveDuration(durationBody);
    }

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Duration value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putPositiveDurationAsync(@NonNull Duration durationBody) {
        return putPositiveDurationWithRestResponseAsync(durationBody)
            .toCompletable();
    }

    /**
     * Get a positive duration value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Duration object if successful.
     */
    public Duration getPositiveDuration() {
        return getPositiveDurationAsync().blockingGet();
    }

    /**
     * Get a positive duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Duration> getPositiveDurationAsync(ServiceCallback<Duration> serviceCallback) {
        return ServiceFuture.fromBody(getPositiveDurationAsync(), serviceCallback);
    }

    /**
     * Get a positive duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Duration>> getPositiveDurationWithRestResponseAsync() {
        return service.getPositiveDuration();
    }

    /**
     * Get a positive duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Duration> getPositiveDurationAsync() {
        return getPositiveDurationWithRestResponseAsync()
            .flatMapMaybe(new Function<BodyResponse<Duration>, Maybe<Duration>>() {
                public Maybe<Duration> apply(BodyResponse<Duration> res) {
                    return res.body() == null ? Maybe.<Duration>empty() : Maybe.just(res.body());
                }
            }
            );
    }

    /**
     * Get an invalid duration value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Duration object if successful.
     */
    public Duration getInvalid() {
        return getInvalidAsync().blockingGet();
    }

    /**
     * Get an invalid duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Duration> getInvalidAsync(ServiceCallback<Duration> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get an invalid duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Duration>> getInvalidWithRestResponseAsync() {
        return service.getInvalid();
    }

    /**
     * Get an invalid duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Duration> getInvalidAsync() {
        return getInvalidWithRestResponseAsync()
            .flatMapMaybe(new Function<BodyResponse<Duration>, Maybe<Duration>>() {
                public Maybe<Duration> apply(BodyResponse<Duration> res) {
                    return res.body() == null ? Maybe.<Duration>empty() : Maybe.just(res.body());
                }
            }
            );
    }
}
