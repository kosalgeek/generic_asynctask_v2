package com.kosalgeek.genasync12;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;

/**
 * Created by kosalmac on 2/28/16.
 */
public interface EachExceptionsHandler {
    void handleIOException(IOException e);
    void handleMalformedURLException(MalformedURLException e);
    void handleProtocolException(ProtocolException e);
    void handleUnsupportedEncodingException(UnsupportedEncodingException e);
}
