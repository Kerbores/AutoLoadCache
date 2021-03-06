package com.jarvis.cache.serializer;

public interface ISerializer<T> {

    /**
     * Serialize the given object to binary data.
     * @param obj object to serialize
     * @return the equivalent binary data
     * @throws Exception 异常
     */
    byte[] serialize(T obj) throws Exception;

    /**
     * Deserialize an object from the given binary data.
     * @param bytes object binary representation
     * @return the equivalent object instance
     * @throws Exception 异常
     */
    T deserialize(byte[] bytes) throws Exception;
}
