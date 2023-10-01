package com.sheremet.taco;
import com.sheremet.taco.tacos.TacoOrder;

import java.util.Optional;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
