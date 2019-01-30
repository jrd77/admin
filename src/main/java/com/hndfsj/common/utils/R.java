/**
 *
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.hndfsj.common.utils;

import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 返回数据
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年10月27日 下午9:59:27
 */
public class R extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	private int pageIndex=0;
	private int pageSize=0;
	private int pages=0;
	private int itemCount=0;
	public R() {
		put("code", 0);
		put("msg", "success");
	}
	
	public static R error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static R error(String msg) {
		return error(500, msg);
	}
	
	public static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public static R ok() {
		return new R();
	}
//	public R addPage(PageUtils pageUtils){
//		if(pageUtils.getCurrPage()>0){
//			put("pageIndex",pageUtils.getCurrPage());
//		}else{
//			put("pageIndex",pageIndex);
//		}
//		if(pageUtils.getPageSize()>0){
//			put("pageSize",pageUtils.getPageSize());
//		}else{
//			put("pageSize",pageSize);
//		}
//		if(!CollectionUtils.isEmpty(pageUtils.getList())){
//			put("itemCount",pageUtils.getList().size());
//			put("respList",pageUtils.getList());
//		}else{
//			put("itemCount",itemCount);
//		}
//		if(pageUtils.getTotalPage()>0){
//			put("pages",pageUtils.getTotalPage());
//		}else{
//			put("pages",pages);
//		}
//		return this;
//	}
	@Override
	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
