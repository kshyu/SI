package net.herit.iot.onem2m.incse.manager;

import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.message.onem2m.OneM2mRequest;
import net.herit.iot.message.onem2m.OneM2mResponse;
import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mRequest.RESOURCE_TYPE;
import net.herit.iot.onem2m.core.convertor.ConvertorFactory;
import net.herit.iot.onem2m.core.convertor.JSONConvertor;
import net.herit.iot.onem2m.core.convertor.XMLConvertor;
import net.herit.iot.onem2m.core.util.OneM2MException;
import net.herit.iot.onem2m.incse.context.OneM2mContext;
import net.herit.iot.onem2m.incse.controller.AnnounceController;
import net.herit.iot.onem2m.incse.controller.NotificationController;
import net.herit.iot.onem2m.incse.controller.RestCommandController;
import net.herit.iot.onem2m.incse.controller.RestNotificationController;
import net.herit.iot.onem2m.incse.facility.CfgManager;
import net.herit.iot.onem2m.incse.facility.OneM2mUtil;
import net.herit.iot.onem2m.incse.manager.dao.ContainerDAO;
import net.herit.iot.onem2m.incse.manager.dao.ContentInstanceDAO;
import net.herit.iot.onem2m.incse.manager.dao.DAOInterface;
import net.herit.iot.onem2m.resource.Container;
import net.herit.iot.onem2m.resource.ContentInstance;
import net.herit.iot.onem2m.resource.Resource;

public class ContentInstanceAnncManager extends AbsManager {
	
	static String ALLOWED_PARENT = "containerAnnc"; 
	static RESOURCE_TYPE RES_TYPE = RESOURCE_TYPE.CONTENT_INST_ANNC; 
	
	private Logger log = LoggerFactory.getLogger(ContentInstanceAnncManager.class);

	private static final String TAG = ContentInstanceAnncManager.class.getName();

	public ContentInstanceAnncManager(OneM2mContext context) {
		super(RES_TYPE, ALLOWED_PARENT);
		this.context = context;
	}
	
	@Override
	public OneM2mResponse create(OneM2mRequest reqMessage) throws OneM2MException {

		return createAnnc(reqMessage, this);
		
	}

	@Override
	public OneM2mResponse retrieve(OneM2mRequest reqMessage) throws OneM2MException {

		return retrieve(reqMessage, this);
			
	}
	
	public OneM2mResponse retrieveOldest(OneM2mRequest reqMessage) throws OneM2MException {
		
		String to = reqMessage.getTo();
		String parentUri = OneM2mUtil.getParentUri(to);
		
		ContentInstanceDAO dao = (ContentInstanceDAO)this.getDAO();
		
		ContainerDAO contDao = new ContainerDAO(context);
		Container parent = (Container)contDao.retrieve(parentUri, null);
		if (parent == null) {
			throw new OneM2MException(RESPONSE_STATUS.NOT_FOUND, "No parent resource:"+parentUri);
		}
		
		Resource res = dao.retrieveOldest(parent.getResourceID(), reqMessage.getResultContentEnum());
		if (res == null) {
			throw new OneM2MException(RESPONSE_STATUS.NOT_FOUND, "Not found");	
		}
		
		if (!OneM2mUtil.checkAccessControlPolicy(reqMessage, OPERATION.RETRIEVE, OneM2mUtil.extractAccessControlPolicies(parent, context))) {
			throw new OneM2MException(RESPONSE_STATUS.ACCESS_DENIED, "Access denied");
		}
		
		res.validate(OPERATION.RETRIEVE);

		OneM2mResponse resMessage = new OneM2mResponse(RESPONSE_STATUS.OK, reqMessage);
		setResponseContentObjectForRetrieve(resMessage, reqMessage.getResultContentEnum(), res, this);		
		
		return resMessage;
		
	}
	
	public OneM2mResponse deleteLatest(OneM2mRequest reqMessage) throws OneM2MException {
		String to = reqMessage.getTo();
		String parentUri = OneM2mUtil.getParentUri(to);
		
		ContentInstanceDAO dao = (ContentInstanceDAO)this.getDAO();
		
		ContainerDAO contDao = new ContainerDAO(context);
		Container parent = (Container)contDao.retrieve(parentUri, null);
		if (parent == null) {
			throw new OneM2MException(RESPONSE_STATUS.NOT_FOUND, "No parent resource:"+parentUri);
		}
		
		Resource res = dao.retrieveLatest(parent.getResourceID(), reqMessage.getResultContentEnum());
		if (res == null) {
			throw new OneM2MException(RESPONSE_STATUS.NOT_FOUND, "Not found");	
		}
		
		if (!OneM2mUtil.checkAccessControlPolicy(reqMessage, OPERATION.DELETE, OneM2mUtil.extractAccessControlPolicies(parent, context))) {
			throw new OneM2MException(RESPONSE_STATUS.ACCESS_DENIED, "Access denied");
		}
		
		ContentInstanceDAO ciDao = new ContentInstanceDAO(context);
		ciDao.delete(res.getResourceID());

		OneM2mResponse resMessage = new OneM2mResponse(RESPONSE_STATUS.DELETED, reqMessage);				
		
		return resMessage;
	}

	public OneM2mResponse retrieveLatest(OneM2mRequest reqMessage) throws OneM2MException {
		
		String to = reqMessage.getTo();
		String parentUri = OneM2mUtil.getParentUri(to);
		
		ContentInstanceDAO dao = (ContentInstanceDAO)this.getDAO();
		
		ContainerDAO contDao = new ContainerDAO(context);
		Container parent = (Container)contDao.retrieve(parentUri, null);
		if (parent == null) {
			throw new OneM2MException(RESPONSE_STATUS.NOT_FOUND, "No parent resource:"+parentUri);
		}
		
		Resource res = dao.retrieveLatest(parent.getResourceID(), reqMessage.getResultContentEnum());
		if (res == null) {
			throw new OneM2MException(RESPONSE_STATUS.NOT_FOUND, "Not found");	
		}
		
		if (!OneM2mUtil.checkAccessControlPolicy(reqMessage, OPERATION.RETRIEVE, 
									OneM2mUtil.extractAccessControlPolicies(parent, context))) {
			throw new OneM2MException(RESPONSE_STATUS.ACCESS_DENIED, "Access denied");
		}
		
		
		res.validate(OPERATION.RETRIEVE);

		OneM2mResponse resMessage = new OneM2mResponse(RESPONSE_STATUS.OK, reqMessage);
		setResponseContentObjectForRetrieve(resMessage, reqMessage.getResultContentEnum(), res, this);		
		
		return resMessage;
			
	}

	public OneM2mResponse deleteOldest(OneM2mRequest reqMessage) throws OneM2MException {
		
		String to = reqMessage.getTo();
		String parentUri = OneM2mUtil.getParentUri(to);
		
		ContentInstanceDAO dao = (ContentInstanceDAO)this.getDAO();
		
		ContainerDAO contDao = new ContainerDAO(context);
		Container parent = (Container)contDao.retrieve(parentUri, null);
		if (parent == null) {
			throw new OneM2MException(RESPONSE_STATUS.NOT_FOUND, "No parent resource:"+parentUri);
		}
		
		Resource res = dao.retrieveOldest(parent.getResourceID(), reqMessage.getResultContentEnum());
		if (res == null) {
			throw new OneM2MException(RESPONSE_STATUS.NOT_FOUND, "Not found");	
		}
		
		if (!OneM2mUtil.checkAccessControlPolicy(reqMessage, OPERATION.RETRIEVE, 
								OneM2mUtil.extractAccessControlPolicies(parent, context))) {
			throw new OneM2MException(RESPONSE_STATUS.ACCESS_DENIED, "Access denied");
		}
		
		ContentInstanceDAO ciDao = new ContentInstanceDAO(context);
		ciDao.delete(res.getResourceID());

		OneM2mResponse resMessage = new OneM2mResponse(RESPONSE_STATUS.DELETED, reqMessage);
		
		return resMessage;
	}
	
	@Override
	public void validateResource(Resource res, OneM2mRequest req, Resource curRes) throws OneM2MException {
		log.debug("validateResource called:"+ res.getUri() +","+ req.getOperationEnum().Name());
		
		// AE-ID, App-ID, Credential-ID, CSE-ID verification using Service subscription profile
		// TBD
		ContentInstance ci = (ContentInstance)res;
		log.debug("ContentInstance:"+ ci.toString());
		
		super.validateResource(res, req, curRes);
	}

	@Override
	public OneM2mResponse update(OneM2mRequest reqMessage) throws OneM2MException {

		return update(reqMessage, this);
		
	}

	@Override
	public OneM2mResponse delete(OneM2mRequest reqMessage) throws OneM2MException {

		return delete(reqMessage, this);
		
	}

	@Override
	public OneM2mResponse notify(OneM2mRequest reqMessage) throws OneM2MException {
		// TODO Auto-generated method stub

		return new OneM2mResponse();
	}
	
	@Override
	public void announceTo(OneM2mRequest reqMessage, Resource resource, Resource orgRes) throws OneM2MException {
		new AnnounceController(context).announce(reqMessage, resource, orgRes, this);
	}

	@Override 
	public void notification(Resource parentRes, Resource reqRes, Resource orgRes, OPERATION op) throws OneM2MException {
		Document reqDoc = reqRes == null? null : Document.parse( ((ContentInstanceDAO)getDAO()).resourceToJson(reqRes));
		Document orgDoc = orgRes == null? null : Document.parse( ((ContentInstanceDAO)getDAO()).resourceToJson(orgRes));
		NotificationController.getInstance().notify(parentRes, reqDoc, reqRes, orgDoc, orgRes, op, this);
		
		// SO/SDA Interface implementation
		RestNotificationController.getInstance().notify(parentRes, reqDoc, reqRes, orgDoc, orgRes, op, this);
		RestCommandController.getInstance().processResult((ContentInstance)reqRes);
	}
	
	@Override
	public DAOInterface getDAO() {
		return new ContentInstanceDAO(context);
	}

	@Override
	public Class<?> getResourceClass() {
		return ContentInstance.class;
	}

	@Override
	public XMLConvertor<?> getXMLConveter() throws OneM2MException {
		return ConvertorFactory.getXMLConvertor(ContentInstance.class, ContentInstance.SCHEMA_LOCATION);
	}

	@Override
	public JSONConvertor<?> getJSONConveter() throws OneM2MException {
		return ConvertorFactory.getJSONConvertor(ContentInstance.class, ContentInstance.SCHEMA_LOCATION);
	}
	
	// If operation is CREATE, res should be parent of target
	@Override
	public boolean checkAccessControlPolicy(OneM2mRequest req, OPERATION op, Resource res, Resource parent) throws OneM2MException {
				
		return OneM2mUtil.checkAccessControlPolicy(req, op, OneM2mUtil.extractAccessControlPolicies(parent, context));		
	}

	@Override
	public void updateResource(Resource resource, OneM2mRequest req) throws OneM2MException {
			 
		ContentInstance cont = (ContentInstance)resource;
		cont.setCreator(req.getFrom());
		
		//// TS-0001-XXX-V1_13_1 - 10.1.1.1	Non-registration related CREATE procedure (ExpirationTime..)
		if(cont.getExpirationTime() == null) {
			cont.setExpirationTime(CfgManager.getInstance().getDefaultExpirationTime());
		}
		// END - Non-registration related CREATE procedure
	}

}
