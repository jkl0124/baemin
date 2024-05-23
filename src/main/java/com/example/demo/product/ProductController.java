package com.example.demo.product;
import com.example.demo.utils.ResponseEntityApi;
import java.awt.print.Pageable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductController {
    ProductService productService;
    @Autowired
    ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/products")
    public ResponseEntityApi.ResponseEntity<?> postProduct(@RequestBody ProductDTO productDTO)
    {
        try {
            Product product = productDTO.toEntity();
            Product saveProduct = productService.save(product);
            productDTO = new ProductDTO(saveProduct);
            return ResponseEntityApi.success(productDTO);
//            log.info(savaProduct.getName());
        } catch (NullPointerException e){
            return ResponseEntityApi.error("저장되지 않았음");
        }
//        if(Validator.isAlpha(productDTO.getName())&&Validator.isNumber(productDTO.getPrice())){
//            return new ResponseEntity<>(HttpStatus.CREATED);
//        }else{
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
    }

    @GetMapping("/products/{id}")
    public ResponseEntityApi.ResponseEntity<?> getProduct(@PathVariable int id){
        Product product = productService.findById(id);
        return ResponseEntityApi.success(product);
    }

    @GetMapping("/products")
    public ResponseEntityApi.ResponseEntity<?> getProducts(@RequestParam("size") int size,@RequestParam("page") int page){
        Pageable pageable = (Pageable) PageRequest.of(page,size);
        return ResponseEntityApi.success(productService.findAll(pageable));
    }


//    @GetMapping("/products/{id}")
//    public ResponseEntity<Product> findProductById(@PathVariable int id) {
//        if (!Validator.isNumber(id)){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        else{
//            Product resultProduct = productService.findProductById(id);
//            if(resultProduct == null){
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            }
//            return new ResponseEntity<Product>(resultProduct,HttpStatus.OK);
//        }
//    }
//
//    @GetMapping("/products")
//    public ResponseEntity<List<Product>> findProducts(@RequestParam("size") int size,@RequestParam("page") int page,@RequestParam(value = "categoryId",required = false) Integer categoryId){
//        List<Product> resultList;
//
//        if(categoryId == null) {
//             resultList = productService.findProducts(size,page);
//        }
//        else{
//            resultList = productService.findProductsByCategory(size,page,categoryId);
//        }
//        try{
//
//        }catch (NullPointerException e){
//
//        }
//        if(resultList == null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(resultList,HttpStatus.OK);
//    }
//
//    @DeleteMapping("/products/{id}")
//    public ResponseEntity deleteProduct(@PathVariable("id") int id){
//        if(!Validator.isNumber(id)){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        boolean result = productService.deleteProductById(id);
//        if(result)
//        {return new ResponseEntity<>(HttpStatus.OK);}
//        else{
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PostMapping("/products/delete")
//    public ResponseEntity deleteProducts(@RequestBody Map<String,List<Integer>> ids){
//        if(ids.get("productIds").isEmpty()){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        for(int i=0;i<ids.size();i++){
//            if(!Validator.isNumber(ids.get("productIds").get(i))){
//                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//            }
//        }
//        boolean result = productService.deleteProductByIds(ids.get("productIds"));
//        if(result){
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//        else{
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
