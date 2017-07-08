package com.rdhaese.commons.utils.transformers;

/**
 * Created on 8/07/2017.
 *
 * @author Robin D'Haese
 */
public abstract class AbstractTransformer<F, B> implements Transformer<F, B>{

    @Override
    public B transformFrom(F f) {
        if (null == f){
            return null;
        }

        return transformFromNotNullProtected(f);
    }

    protected abstract B transformFromNotNullProtected(F f);

    @Override
    public F transformBack(B b) {
        if (null == b){
            return null;
        }

        return transformBackNotNullProtected(b);
    }

    protected abstract F transformBackNotNullProtected(B b);
}
