/**
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.project.demo.utils;

import java.util.UUID;

/**
 * <p>
 * 高效GUID产生算法(sequence),基于Snowflake实现64位自增ID算法。 <br>
 * 优化开源项目 http://git.oschina.net/yu120/sequence
 * </p>
 *
 * @author xxx
 * @since 202X-XX-XX
 */
public class IdWorker {

    private IdWorker() {
    }

    /**
     * 主机和进程的机器码
     */
    private static Sequence worker = new Sequence(0, 0);

    public static long getId() {
        return worker.nextId();
    }

    /**
     * 由于js精度问题，只能处理到15位，所以一般情况下将其转换成字符串
     * @return
     */
    public static String getIdAsString() {
        return String.valueOf(getId());
    }

    /**
     * <p>
     * 获取去掉"-" UUID
     * </p>
     */
    public static synchronized String get32UUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
