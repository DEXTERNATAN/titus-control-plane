package com.netflix.titus.supplementary.relocation.endpoint;

import com.netflix.archaius.api.annotations.Configuration;
import com.netflix.archaius.api.annotations.DefaultValue;

@Configuration(prefix = "titus.relocation.endpoint")
public interface TaskRelocationEndpointConfiguration {

    @DefaultValue("7104")
    int getGrpcPort();

    /**
     * Graceful shutdown time for GRPC server. If zero, shutdown happens immediately, and all client connections are
     * terminated abruptly.
     */
    @DefaultValue("30000")
    long getShutdownTimeoutMs();

    @DefaultValue("1800000")
    long getMaxConnectionAgeMs();
}
