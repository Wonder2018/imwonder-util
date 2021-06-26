package top.imwonder.util;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64Util {

    public static final Encoder URL_SAFE_ENCODER = Base64.getUrlEncoder().withoutPadding();

    public static final Encoder MIME_ENCODER = Base64.getMimeEncoder();

    public static final Decoder URL_SAFE_DECODER = Base64.getUrlDecoder();

    public static final Decoder MIME_DECODER = Base64.getMimeDecoder();

    public static String toBase64String(String rawData) {
        return MIME_ENCODER.encodeToString(rawData.getBytes());
    }

    public static byte[] toBase64(String rawData) {
        return MIME_ENCODER.encode(rawData.getBytes());
    }

    public static String toBase64String(byte[] rawData) {
        return MIME_ENCODER.encodeToString(rawData);
    }

    public static byte[] toBase64(byte[] rawData) {
        return MIME_ENCODER.encode(rawData);
    }

    public static String toUrlSafeBase64String(String rawData) {
        return URL_SAFE_ENCODER.encodeToString(rawData.getBytes());
    }

    public static byte[] toUrlSafeBase64(String rawData) {
        return URL_SAFE_ENCODER.encode(rawData.getBytes());
    }

    public static String toUrlSafeBase64String(byte[] rawData) {
        return URL_SAFE_ENCODER.encodeToString(rawData);
    }

    public static byte[] toUrlSafeBase64(byte[] rawData) {
        return URL_SAFE_ENCODER.encode(rawData);
    }

    public static byte[] decodeBase64(byte[] base64) {
        return MIME_DECODER.decode(base64);
    }

    public static byte[] decodeBase64(String base64) {
        return MIME_DECODER.decode(base64);
    }

    public static byte[] decodeUrlSafeBase64(byte[] base64) {
        return URL_SAFE_DECODER.decode(base64);
    }

    public static byte[] decodeUrlSafeBase64(String base64) {
        return URL_SAFE_DECODER.decode(base64);
    }

    public static String decodeBase64String(byte[] base64) {
        return new String(MIME_DECODER.decode(base64));
    }

    public static String decodeBase64String(String base64) {
        return new String(MIME_DECODER.decode(base64));
    }

    public static String decodeUrlSafeBase64String(byte[] base64) {
        return new String(URL_SAFE_DECODER.decode(base64));
    }

    public static String decodeUrlSafeBase64String(String base64) {
        return new String(URL_SAFE_DECODER.decode(base64));
    }

}
