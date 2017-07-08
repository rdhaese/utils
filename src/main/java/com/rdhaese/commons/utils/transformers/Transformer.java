package com.rdhaese.commons.utils.transformers;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created on 6/05/2017.
 *
 * @author Robin D'Haese
 */
public interface Transformer<F, B> {

    B transformFrom(F f);

    default Stream<B> transformFrom(Stream<F> fStream){
        return fStream.map(this::transformFrom);
    }
    default Collection<B> transformFrom(Collection<F> fCollection){
           return transformFrom(fCollection.stream())
                   .collect(Collectors.toList());
    }

    default B[] transformFrom(F[] fArray){
        return (B[]) transformFrom(Arrays.stream(fArray)).toArray();
    }

    F transformBack(B b);

    default Stream<F> transformBack(Stream<B> bStream){
        return bStream.map(this::transformBack);
    }
    default Collection<F> transformBack(Collection<B> bCollection){
        return transformBack(bCollection.stream())
                .collect(Collectors.toList());
    }

    default F[] transformBack(B[] bArray){
        return (F[]) transformBack(Arrays.stream(bArray)).toArray();
    }
}
