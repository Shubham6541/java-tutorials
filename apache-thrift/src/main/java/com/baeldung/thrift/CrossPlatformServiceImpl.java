package com.nklkarthi.thrift;

import com.nklkarthi.thrift.impl.CrossPlatformResource;
import com.nklkarthi.thrift.impl.CrossPlatformService;
import com.nklkarthi.thrift.impl.InvalidOperationException;

import org.apache.thrift.TException;

import java.util.Collections;
import java.util.List;

public class CrossPlatformServiceImpl implements CrossPlatformService.Iface {

    @Override
    public CrossPlatformResource get(final int id) throws InvalidOperationException, TException {
        // add some action
        return new CrossPlatformResource();
    }

    @Override
    public void save(final CrossPlatformResource resource) throws InvalidOperationException, TException {
        // add some action
    }

    @Override
    public List<CrossPlatformResource> getList() throws InvalidOperationException, TException {
        // add some action
        return Collections.emptyList();
    }

    @Override
    public boolean ping() throws InvalidOperationException, TException {
        return true;
    }
}
