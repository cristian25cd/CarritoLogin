/* ========================================================================
   * Copyright 2014 ejemplo
   *
   * Licensed under the MIT, The MIT License (MIT)
   * Copyright (c) 2014 ejemplo
  
  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:
  
  The above copyright notice and this permission notice shall be included in
  all copies or substantial portions of the Software.
  
  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
  THE SOFTWARE.
   * ========================================================================
  
  
  Source generated by CrudMaker version 1.0.0.201411201032*/

package co.edu.uniandes.csw.ejemplo.producto.logic.mock;
import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.csw.ejemplo.producto.logic.dto.ProductoDTO;
import co.edu.uniandes.csw.ejemplo.producto.logic.dto.ProductoPageDTO;
import co.edu.uniandes.csw.ejemplo.producto.logic.api._IProductoLogicService;

public abstract class _ProductoMockLogicService implements _IProductoLogicService {

	private Long id= new Long(1);
	protected List<ProductoDTO> data=new ArrayList<ProductoDTO>();

	public ProductoDTO createProducto(ProductoDTO producto){
		id++;
		producto.setId(id);
		data.add(producto);
		return producto;
    }
    
    public List<ProductoDTO> getProductos(){
		return data; 
	}

	public ProductoPageDTO getProductos(Integer page, Integer maxRecords){
		ProductoPageDTO response = new ProductoPageDTO();
		response.setTotalRecords(Long.parseLong(data.size()+""));
		response.setRecords(data);
		return response;
	}

	public ProductoDTO getProducto(Long id){
		for(ProductoDTO data1:data){
			if(data1.getId().equals(id)){
				return data1;
			}
		}
		return null;
	}

	public void deleteProducto(Long id){
	    ProductoDTO delete=null;
		for(ProductoDTO data1:data){
			if(data1.getId().equals(id)){
				delete=data1;
			}
		}
		if(delete!=null){
			data.remove(delete);
		} 
	}

	public void updateProducto(ProductoDTO producto){
	    ProductoDTO delete=null;
		for(ProductoDTO data1:data){
			if(data1.getId().equals(producto.getId())){
				delete=data1;
			}
		}
		if(delete!=null){
			data.remove(delete);
			data.add(producto);
		} 
	}	
}