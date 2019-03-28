/*
 *   Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License").
 *   You may not use this file except in compliance with the License.
 *   A copy of the License is located at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file. This file is distributed
 *   on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *   express or implied. See the License for the specific language governing
 *   permissions and limitations under the License.
 */

package com.amazon.opendistro.jobscheduler.spi;

import com.amazon.opendistro.jobscheduler.spi.schedule.Schedule;
import org.elasticsearch.common.xcontent.ToXContentObject;

import java.time.Instant;

public interface ScheduledJobParameter extends ToXContentObject {
    // String getJobId();
    String getName();
    Instant getLastUpdateTime(); // TODO: consider removing this method
    Instant getEnableTime();
    Schedule getSchedue();
    boolean isEnabled();
}