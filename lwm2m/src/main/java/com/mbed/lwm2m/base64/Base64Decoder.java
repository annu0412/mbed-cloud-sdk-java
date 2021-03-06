package com.mbed.lwm2m.base64;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

import com.mbed.lwm2m.DecodingException;
import com.mbed.lwm2m.EncodingType;
import com.mbed.lwm2m.json.JsonDecoder;
import com.mbed.lwm2m.tlv.TLVDecoder;

public class Base64Decoder {

    public Base64Decoder() {
        super();
    }

    /**
     * Decodes a LWM2M sequence encoded in Base64 into a list of LWM2M objects for which the type is not yet know
     *
     * @param buffer
     *            sequence to decode
     * @param contentType
     *            content type of the sequence
     * @return List of LWM2M objects (i.e. Object instance, Resource instance, Resource) or bytes if content type is not
     *         recognised
     * @throws DecodingException
     *             if an error occurred during parsing
     */
    public static List<?> decodeBase64(ByteBuffer buffer, EncodingType contentType) throws DecodingException {
        if (buffer == null || contentType == null) {
            return null;
        }
        ByteBuffer decodedByteBuffer = decode(buffer);
        switch (contentType) {
            case JSON:
                return JsonDecoder.decodeJson(decodedByteBuffer);
            case TLV:
                return TLVDecoder.decodeTlv(decodedByteBuffer);
            default:
                break;

        }
        return Arrays.asList(decodedByteBuffer.array());
    }

    /**
     * Decodes a LWM2M sequence encoded in Base64 into a list of LWM2M objects of type T
     *
     * @param buffer
     *            sequence to decode
     * @param <T>
     *            type of LWM2M objects to expect
     * @param clazz
     *            type of LWM2M objects (i.e. Object instance, Resource instance, Resource) expected in sequence
     * @param contentType
     *            content type of the sequence
     * @return List of LWM2M objects of type T or null if content type is not recognised
     * @throws DecodingException
     *             if an error occurred during parsing
     */
    public static <T> List<T> decodeBase64(ByteBuffer buffer, Class<T> clazz, EncodingType contentType)
            throws DecodingException {
        if (buffer == null || contentType == null || contentType == EncodingType.UNKNOWN) {
            return null;
        }
        ByteBuffer decodedByteBuffer = decode(buffer);
        switch (contentType) {
            case JSON:
                return JsonDecoder.decodeJson(decodedByteBuffer, clazz);
            case TLV:
                return TLVDecoder.decodeTlv(decodedByteBuffer, clazz);
            default:
                break;

        }
        return null;
    }

    public static ByteBuffer decode(ByteBuffer input) {
        if (input == null) {
            return null;
        }
        return ByteBuffer.wrap(Base64.decodeBase64(input.array()));
    }

    public static String decodeToUTF8(ByteBuffer input) {
        if (input == null) {
            return null;
        }
        return new String(decode(input).array(), StandardCharsets.UTF_8);
    }

    public static ByteBuffer decode(String input) {
        if (input == null) {
            return null;
        }
        return ByteBuffer.wrap(Base64.decodeBase64(input));
    }

    public static String decodeToUtf8(String input) {
        if (input == null) {
            return null;
        }
        return new String(decode(input).array(), StandardCharsets.UTF_8);
    }
}
