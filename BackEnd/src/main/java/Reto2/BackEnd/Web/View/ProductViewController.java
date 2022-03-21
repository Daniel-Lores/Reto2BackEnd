package Reto2.BackEnd.Web.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import Reto2.BackEnd.Services.OrderProductsServices;
import Reto2.BackEnd.Services.OrdersServices;
import Reto2.BackEnd.Services.ProductsServices;
import Reto2.BackEnd.Services.Models.OrderProductDTO;

@Controller
public class ProductViewController {
    private final ProductsServices productService;
    private final OrdersServices orderService;
    private final OrderProductsServices orderProductService;
    
    public ProductViewController(ProductsServices productService, OrdersServices orderServices, OrderProductsServices orderProductService) {
        this.productService = productService;
        this.orderService = orderServices;
        this.orderProductService = orderProductService;
    }

    @GetMapping("/order/view/{id}")
    public ModelAndView Get(@PathVariable("id") Long id) {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("products", productService.getAll());
        mav.addObject("orderProducts", orderService.getAllByOrderId(id));
        return mav;
    }

    @GetMapping("/order/add/{idProduct}")
    public ModelAndView Add(@PathVariable("idProduct") Long idProduct){
        ModelAndView mav = new ModelAndView("index");
        Long idOrder = (long)1;
        mav.addObject("products", productService.getAll());
        mav.addObject("orderProducts", orderService.getAllByOrderId(idOrder));
        OrderProductDTO orderProduct = new OrderProductDTO(1, idProduct, idOrder);
        orderProductService.add(orderProduct);
        return mav;
    }

    @GetMapping("/order/delete/{idOrderProduct}")
    public ModelAndView Delete(@PathVariable("idOrderProduct") Long idOrderProduct){
        ModelAndView mav = new ModelAndView("index");
        Long idOrder = (long)1;
        mav.addObject("products", productService.getAll());
        mav.addObject("orderProducts", orderService.getAllByOrderId(idOrder));
        orderProductService.deleteOrderProduct(idOrderProduct);
        return mav;
    }
}
