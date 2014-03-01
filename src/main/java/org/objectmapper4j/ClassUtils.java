/*
 * ObjectMapper4j
 * Copyright (c) 2014, Rafal Chojnacki, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package org.objectmapper4j;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Rafal Chojnacki
 */
class ClassUtils {

    private ClassUtils() {}

    public static Class[] getGenericSuperclasses(final Class genericClass) {
        Type[] actualTypeArguments = ((ParameterizedType) genericClass.getGenericSuperclass())
                .getActualTypeArguments();

        Class[] result = new Class[actualTypeArguments.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = (Class) actualTypeArguments[i];
        }

        return result;
    }
}