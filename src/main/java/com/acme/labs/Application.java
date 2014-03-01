
package com.acme.labs;

import com.acme.log.Log;
import com.acme.log.Logger;

public class Application {
    private static final Logger LOG = Log.getLogger(Application.class);
    public static void main(String[] args) {
        LOG.debug("hello world!");
    }
}
